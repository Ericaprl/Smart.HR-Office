// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smart_Onboarding3.proto

package onboarding.service3;

public final class Service3_Impl {
  private Service3_Impl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_Employee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_Employee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_OnboardingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_OnboardingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_OnboardingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_OnboardingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_CreateEmployeeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_CreateEmployeeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_CreateEmployeeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_CreateEmployeeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_EmployeeStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_EmployeeStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_EmployeeStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_EmployeeStatusResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027smart_Onboarding3.proto\022\017Smart.HR_Offi" +
      "ce\"4\n\010Employee\022\014\n\004name\030\001 \001(\t\022\r\n\005email\030\002 " +
      "\001(\t\022\013\n\003age\030\003 \001(\005\"@\n\021OnboardingRequest\022+\n" +
      "\010employee\030\001 \001(\0132\031.Smart.HR_Office.Employ" +
      "ee\";\n\022OnboardingResponse\022\024\n\014is_onboarded" +
      "\030\001 \001(\010\022\017\n\007message\030\002 \001(\t\";\n\025CreateEmploye" +
      "eRequest\022\020\n\010username\030\001 \001(\t\022\020\n\010password\030\002" +
      " \001(\t\":\n\026CreateEmployeeResponse\022\017\n\007succes" +
      "s\030\001 \001(\010\022\017\n\007message\030\002 \001(\t\",\n\025EmployeeStat" +
      "usRequest\022\023\n\013employee_id\030\001 \001(\t\"I\n\026Employ" +
      "eeStatusResponse\022\023\n\013employee_id\030\001 \001(\t\022\032\n" +
      "\022is_employee_active\030\002 \001(\0102\311\002\n\024Onboarding" +
      "_employees\022`\n\017OnboardEmployee\022\".Smart.HR" +
      "_Office.OnboardingRequest\032#.Smart.HR_Off" +
      "ice.OnboardingResponse\"\000(\0010\001\022c\n\016CreateEm" +
      "ployee\022&.Smart.HR_Office.CreateEmployeeR" +
      "equest\032\'.Smart.HR_Office.CreateEmployeeR" +
      "esponse\"\000\022j\n\023CheckEmployeeStatus\022&.Smart" +
      ".HR_Office.EmployeeStatusRequest\032\'.Smart" +
      ".HR_Office.EmployeeStatusResponse\"\000(\001B&\n" +
      "\023onboarding.service3B\rService3_ImplP\001b\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Smart_HR_Office_Employee_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Smart_HR_Office_Employee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_Employee_descriptor,
        new java.lang.String[] { "Name", "Email", "Age", });
    internal_static_Smart_HR_Office_OnboardingRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Smart_HR_Office_OnboardingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_OnboardingRequest_descriptor,
        new java.lang.String[] { "Employee", });
    internal_static_Smart_HR_Office_OnboardingResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Smart_HR_Office_OnboardingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_OnboardingResponse_descriptor,
        new java.lang.String[] { "IsOnboarded", "Message", });
    internal_static_Smart_HR_Office_CreateEmployeeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Smart_HR_Office_CreateEmployeeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_CreateEmployeeRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_Smart_HR_Office_CreateEmployeeResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Smart_HR_Office_CreateEmployeeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_CreateEmployeeResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_Smart_HR_Office_EmployeeStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Smart_HR_Office_EmployeeStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_EmployeeStatusRequest_descriptor,
        new java.lang.String[] { "EmployeeId", });
    internal_static_Smart_HR_Office_EmployeeStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Smart_HR_Office_EmployeeStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_EmployeeStatusResponse_descriptor,
        new java.lang.String[] { "EmployeeId", "IsEmployeeActive", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}