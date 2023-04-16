package Client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.awt.Color;

import meeting.service1.CancelMeetingRequest;
import meeting.service1.CancelMeetingResponse;
import meeting.service1.CreateMeetingRequest;
import meeting.service1.CreateMeetingResponse;
import meeting.service1.ModifyMeetingRequest;
import meeting.service1.ModifyMeetingResponse;
import meeting.service1.Schedule_MeetingGrpc;
import onboarding.service3.CreateEmployeeRequest;
import onboarding.service3.CreateEmployeeResponse;
import onboarding.service3.Employee;
import onboarding.service3.EmployeeStatusRequest;
import onboarding.service3.EmployeeStatusResponse;
import onboarding.service3.OnboardingRequest;
import onboarding.service3.OnboardingResponse;
import onboarding.service3.Onboarding_employeesGrpc;
import temperature.service2.AdjustRoomTemperatureRequest;
import temperature.service2.AdjustRoomTemperatureResponse;
import temperature.service2.RoomTemperatureRequest;
import temperature.service2.RoomTemperatureResponse;
import temperature.service2.Room_Temperature_controlGrpc;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JScrollPane;

import javax.swing.JComboBox;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

import meeting.service1.Server1_meeting;
import meeting.service1.Schedule_MeetingGrpc.Schedule_MeetingStub;
import onboarding.service3.Server3_Onboarding;
import onboarding.service3.Onboarding_employeesGrpc.Onboarding_employeesBlockingStub;
import onboarding.service3.Onboarding_employeesGrpc.Onboarding_employeesStub;
import temperature.service2.Server2_Temperature;
import temperature.service2.TemperatureRequest;
import temperature.service2.TemperatureResponse;
import temperature.service2.Room_Temperature_controlGrpc.Room_Temperature_controlBlockingStub;
import temperature.service2.Room_Temperature_controlGrpc.Room_Temperature_controlStub;

import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class GuiClient extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JComboBox<String> comboBoxServer;
	private JComboBox<String> comboBoxServices;

	static String host = "localhost";
	static String resolvedIP;
	
	private static Schedule_MeetingStub nonblockingstub;

	private static Room_Temperature_controlBlockingStub blockingStub;
	private static Room_Temperature_controlStub nonblockingstub2;
	private static Onboarding_employeesBlockingStub blockingStub2;
	private static Onboarding_employeesStub nonblockingstub3;

	private static ManagedChannel clientChannel1;
	private static ManagedChannel clientChannel2;
	private static ManagedChannel clientChannel3;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		testClientJMDNS();


		clientChannel1 = ManagedChannelBuilder.forAddress(host, 9099).usePlaintext().build();
		nonblockingstub = Schedule_MeetingGrpc.newStub(clientChannel1);

		clientChannel2 = ManagedChannelBuilder.forAddress(host, 5050).usePlaintext().build();
		blockingStub = Room_Temperature_controlGrpc.newBlockingStub(clientChannel2);
		nonblockingstub2 = Room_Temperature_controlGrpc.newStub(clientChannel2);

		clientChannel3 = ManagedChannelBuilder.forAddress(host, 5051).usePlaintext().build();
		blockingStub2 = Onboarding_employeesGrpc.newBlockingStub(clientChannel3);
		nonblockingstub3 = Onboarding_employeesGrpc.newStub(clientChannel3);
		

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					GuiClient frame = new GuiClient();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();

				}

			}

		});
	}

	/**
	 * Create the frame.
	 */
	public GuiClient() {
		setType(Type.UTILITY);
		setBackground(new Color(86, 18, 87));
		setForeground(new Color(86, 18, 87));
		setFont(new Font("Euphemia UCAS", Font.BOLD, 30));

		setTitle("Smart HR Office ");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 485, 497);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(212, 107, 104));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		contentPane.setVisible(true);

		JLabel labelServer = new JLabel("Servers");
		labelServer.setForeground(new Color(254, 255, 255));
		labelServer.setFont(new Font("Euphemia UCAS", Font.PLAIN, 20));
		labelServer.setHorizontalAlignment(SwingConstants.CENTER);
		labelServer.setBounds(47, 36, 76, 28);
		contentPane.add(labelServer);

		comboBoxServer = new JComboBox<String>();

		comboBoxServer.setMaximumRowCount(3);
		comboBoxServer.setFont(new Font("Euphemia UCAS", Font.PLAIN, 14));
		comboBoxServer.setBounds(16, 76, 204, 74);
		contentPane.add(comboBoxServer);

		comboBoxServer.addItem("Select server");
		comboBoxServer.addItem("Server 1 - Schedule Meeting");
		comboBoxServer.addItem("Server 2 - Room Temperature");
		comboBoxServer.addItem("Server 3 - Onboarding");

		JLabel labelServices = new JLabel("Services");
		labelServices.setForeground(new Color(254, 255, 255));
		labelServices.setFont(new Font("Euphemia UCAS", Font.PLAIN, 20));
		labelServices.setHorizontalAlignment(SwingConstants.CENTER);
		labelServices.setBounds(322, 40, 91, 20);
		contentPane.add(labelServices);

		comboBoxServices = new JComboBox<String>();
		comboBoxServices.setFont(new Font("Euphemia UCAS", Font.PLAIN, 14));
		comboBoxServices.setMaximumRowCount(9);
		comboBoxServices.setBounds(264, 76, 204, 74);
		contentPane.add(comboBoxServices);
		
   


		comboBoxServer.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String selectedServer = (String) comboBoxServer.getSelectedItem();
		        
		        
		        comboBoxServices.removeAllItems();

		        if (selectedServer.equals("Server 1 - Schedule Meeting")) {
		            comboBoxServices.addItem("Create Meeting");
		            comboBoxServices.addItem("Modify Meeting");
		            comboBoxServices.addItem("Cancel Meeting");
		            
		        } else if (selectedServer.equals("Server 2 - Room Temperature")) {
		            comboBoxServices.addItem("Set Room Temperature");
		            comboBoxServices.addItem("Show Room Temperature");
		            comboBoxServices.addItem("Adjust Room Temperature");
		            
		        } else if (selectedServer.equals("Server 3 - Onboarding")) {
		            comboBoxServices.addItem("Create Employee");
		            comboBoxServices.addItem("Check Employee Status");
		            comboBoxServices.addItem("Onboard Employee");
		        }
		    }
		});
		

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBackground(new Color(238, 238, 238));
		btnConfirm.setForeground(new Color(121, 121, 121));
		btnConfirm.setFont(new Font("Euphemia UCAS", Font.BOLD, 14));
		btnConfirm.setBounds(170, 173, 123, 40);
		contentPane.add(btnConfirm);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Euphemia UCAS", Font.PLAIN, 14));
		textArea.setBounds(22, 281, 446, 150);
		contentPane.add(textArea);

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(16, 237, 452, 220);
		contentPane.add(scrollPane);

		JScrollBar scrollBar = new JScrollBar(JScrollBar.VERTICAL);
		scrollBar.setValue(2);
		scrollBar.setUnitIncrement(2);
		scrollBar.setForeground(new Color(255, 125, 120));
		scrollBar.setBackground(new Color(255, 125, 120));
		scrollBar.setBounds(438, 281, 30, 106);
		contentPane.add(scrollBar);

		btnConfirm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String selectedService = (String) comboBoxServices.getSelectedItem(); // Update the variable name

				if (selectedService.equals("Create Meeting")) {

					new Thread(() -> {
						try {
							Server1_meeting.main(new String[] {});
						} catch (InterruptedException | IOException e1) {
							e1.printStackTrace();
						}
					}).start();

					try {
						Thread.sleep(20000);

					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}

					createMeeting();

				} else if (selectedService.equals("Modify Meeting")) {

					new Thread(() -> {
						try {
							Server1_meeting.main(new String[] {});
						} catch (InterruptedException | IOException e1) {
							e1.printStackTrace();
						}
					}).start();

					try {
						Thread.sleep(20000);

					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}

					modifyMeeting();

				} else if (selectedService.equals("Cancel Meeting")) {

					new Thread(() -> {
						try {
							Server1_meeting.main(new String[] {});
						} catch (InterruptedException | IOException e1) {
							e1.printStackTrace();
						}
					}).start();

					try {
						Thread.sleep(20000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}

					cancelMeeting();

				} else if (selectedService.equals("Set Room Temperature")) {

					new Thread(() -> {
						try {
							Server2_Temperature.main(new String[] {});
						} catch (InterruptedException | IOException e1) {
							e1.printStackTrace();
						}
					}).start();

					try {
						Thread.sleep(20000);

					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}

					setRoomTemperature();

				} else if (selectedService.equals("Show Room Temperature")) {

					new Thread(() -> {
						try {
							Server2_Temperature.main(new String[] {});
						} catch (InterruptedException | IOException e1) {
							e1.printStackTrace();
						}
					}).start();

					try {
						Thread.sleep(20000);

					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					showRoomTemperature();

				} else if (selectedService.equals("Adjust Room Temperature")) {

					new Thread(() -> {
						try {
							Server2_Temperature.main(new String[] {});
						} catch (InterruptedException | IOException e1) {
							e1.printStackTrace();
						}
					}).start();

					try {
						Thread.sleep(20000);

					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}

					adjustRoomTemperature();

				} else if (selectedService.equals("Create Employee")) {

					new Thread(() -> {
						try {
							Server3_Onboarding.main(new String[] {});
						} catch (InterruptedException | IOException e1) {
							e1.printStackTrace();
						}
					}).start();

					try {
						Thread.sleep(20000);

					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}

					createEmployee();

				} else if (selectedService.equals("Check Employee Status")) {

					new Thread(() -> {
						try {
							Server3_Onboarding.main(new String[] {});
						} catch (InterruptedException | IOException e1) {
							e1.printStackTrace();
						}
					}).start();

					try {
						Thread.sleep(20000);

					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}

					checkEmployeeStatus();

				} else if (selectedService.equals("Onboard Employee")) {

					new Thread(() -> {
						try {
							Server3_Onboarding.main(new String[] {});
						} catch (InterruptedException | IOException e1) {
							e1.printStackTrace();
						}
					}).start();

					try {
						Thread.sleep(20000);

					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}

					onboardEmployee();

				} else {
					JOptionPane.showMessageDialog(null, "Invalid choice, please try again.");

				}

			}

		});
		
		
		

		PrintStream printStream = new PrintStream(new OutputStream() {
			@Override
			public void write(int b) throws IOException {
				textArea.append(String.valueOf((char) b));
			}
		});
		System.setOut(printStream);
		System.setErr(printStream);
		

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				// Shutdown the client channels on window close
				try {
					clientChannel1.shutdown().awaitTermination(1, TimeUnit.SECONDS);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				try {
					clientChannel2.shutdown().awaitTermination(1, TimeUnit.SECONDS);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				try {
					clientChannel3.shutdown().awaitTermination(1, TimeUnit.SECONDS);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
	}

	
	public static void testClientJMDNS() {
	    try {
	        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

	        jmdns.addServiceListener(host, new SampleListener());

	        Thread.sleep(10);

	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	private static class SampleListener implements ServiceListener {
	    public void serviceAdded(ServiceEvent event) {
	        System.out.println("Service added: " + event.getInfo());
	    }

	    public void serviceRemoved(ServiceEvent event) {
	        System.out.println("Service removed: " + event.getInfo());
	    }

	    @SuppressWarnings("deprecation")
	    public void serviceResolved(ServiceEvent event) {
	        System.out.println("Service resolved: " + event.getInfo());

	        ServiceInfo info = event.getInfo();
	        int port = info.getPort();
	        String resolvedIP = info.getHostAddress();
	        System.out.println("IP Resolved - " + resolvedIP + ":" + port);
	    }
	}
	
	

	// RCP create Meeting
	public static void createMeeting() {
		StreamObserver<CreateMeetingResponse> response = new StreamObserver<CreateMeetingResponse>() {

			@Override
			public void onNext(CreateMeetingResponse response) {
				System.out.println(
						"Received response from the server: " + response.getMeetingId() + " " + response.getMessage());
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("Stream completed");

			}

		};

		StreamObserver<CreateMeetingRequest> streamCreatmeeting = nonblockingstub.createMeeting(response);

		try {
			streamCreatmeeting.onNext(CreateMeetingRequest.newBuilder().setOrganizerId("John")
					.setTitle("Weekly Meeting").setStartTime(System.currentTimeMillis() + 3600000) // start time in one
																									// hour
					.build());

			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		streamCreatmeeting.onCompleted();
	}

	// RCP modify Meeting
	public static void modifyMeeting() {
		StreamObserver<ModifyMeetingResponse> responsemidy = new StreamObserver<ModifyMeetingResponse>() {

			@Override
			public void onNext(ModifyMeetingResponse response) {
				System.out.println("Received response from the server: " + " \n " + response.getSuccessModify() + " "
						+ response.getMessage());

			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("Stream completed");

			}

		};

		StreamObserver<ModifyMeetingRequest> streamomodify = nonblockingstub.modifyMeeting(responsemidy);

		for (int i = 0; i < 5; i++) {
			streamomodify.onNext(ModifyMeetingRequest.newBuilder().build());

		}

		streamomodify.onCompleted();
	}

	// RCP cancel Meeting
	public static void cancelMeeting() {

		nonblockingstub.cancelMeeting(CancelMeetingRequest.newBuilder().build(),
				new StreamObserver<CancelMeetingResponse>() {

					@Override
					public void onNext(CancelMeetingResponse response) {
						System.out.println("Received response from the server: " + response.getSuccessCancel() + " "
								+ response.getErrorMessage());

					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();
					}

					@Override
					public void onCompleted() {
						System.out.println("Stream completed");

					}

				});

	}

	// Server Streaming RPC set room

	public static void setRoomTemperature() {

		nonblockingstub2.setRoomTemperature(TemperatureRequest.newBuilder().build(),
				new StreamObserver<TemperatureResponse>() {

					@Override
					public void onNext(TemperatureResponse setResponse) {

						double temp = setResponse.getCurrentTemperature();
						temp = 20;

						System.out.println(" -- Received response from the server: -- " + temp
								+ setResponse.getCurrentTemperature());

					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();

					}

					@Override
					public void onCompleted() {
						System.out.println("Stream completed");

					}

				});

	}

	// unary RPC show room
	public static void showRoomTemperature() {

		RoomTemperatureResponse response = blockingStub
				.showRoomTemperature(RoomTemperatureRequest.newBuilder().setRoomNumber(3).build());

		System.out.println(" Message sent by server:" + "\n" + " Temperature: " + response.getTemperature()
				+ response.getMessage());

	}

	// Bidirectional streaming RPC adjust room
	public static void adjustRoomTemperature() {

		StreamObserver<AdjustRoomTemperatureResponse> adjResponse = new StreamObserver<AdjustRoomTemperatureResponse>() {

			@Override
			public void onNext(AdjustRoomTemperatureResponse adjResponse) {
				System.out.println("Received response from the server: " + adjResponse.getNewAdjTemperature() + " "
						+ adjResponse.getMessage());

			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("Stream completed");

			}
		};

		StreamObserver<AdjustRoomTemperatureRequest> streamAdj = nonblockingstub2.adjustRoomTemperature(adjResponse);

		try {
			streamAdj.onNext(
					AdjustRoomTemperatureRequest.newBuilder().setTemperatureAdjustment(19).setAdjRoomNumber(3).build());

			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		streamAdj.onCompleted();

	}

	// bidirectional streamin RPC

	public static void onboardEmployee() {
		StreamObserver<OnboardingResponse> onborResponse = new StreamObserver<OnboardingResponse>() {

			@Override
			public void onNext(OnboardingResponse onborResponse) {

				System.out.println("Received response from the server: " + onborResponse.getIsOnboarded()
						+ onborResponse.getMessage());

			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("Stream completed");

			}

		};

		StreamObserver<OnboardingRequest> streamOmbor = nonblockingstub3.onboardEmployee(onborResponse);

		try {
			Employee employee = Employee.newBuilder().setName("Erica").setEmail("Erica@gmail.com").setAge(29).build();

			streamOmbor.onNext(OnboardingRequest.newBuilder().setEmployee(employee).build());

			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		streamOmbor.onCompleted();

	}

	// Unary RPC

	public static void createEmployee() {

		CreateEmployeeResponse response = blockingStub2.createEmployee(
				CreateEmployeeRequest.newBuilder().setUsername("Erica123").setPassword(" Testing321").build());

		System.out
				.println(" Message sent by server:" + "\n" + " User: " + response.getSuccess() + response.getMessage());

	}

	// client streaming RPC

	public static void checkEmployeeStatus() {

		StreamObserver<EmployeeStatusResponse> statusResponse = new StreamObserver<EmployeeStatusResponse>() {

			@Override
			public void onNext(EmployeeStatusResponse statusResponse) {
				System.out.println("Received response from the server: " + statusResponse.getEmployeeId() + " "
						+ statusResponse.getIsEmployeeActive());
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				System.out.println("Stream completed");

			}
		};

		StreamObserver<EmployeeStatusRequest> streamStatus = nonblockingstub3.checkEmployeeStatus(statusResponse);

		try {
			streamStatus.onNext(EmployeeStatusRequest.newBuilder().setEmployeeId("erica12345").build());

			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		streamStatus.onCompleted();
	}
}
