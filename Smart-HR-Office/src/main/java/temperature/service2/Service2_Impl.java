// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smart_Room_Temperature2.proto

package temperature.service2;

public final class Service2_Impl {
  private Service2_Impl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_RoomTemperatureRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_RoomTemperatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_RoomTemperatureResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_RoomTemperatureResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_TemperatureRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_TemperatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_TemperatureResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_TemperatureResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_AdjustRoomTemperatureRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_AdjustRoomTemperatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Smart_HR_Office_AdjustRoomTemperatureResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Smart_HR_Office_AdjustRoomTemperatureResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035smart_Room_Temperature2.proto\022\017Smart.H" +
      "R_Office\"-\n\026RoomTemperatureRequest\022\023\n\013ro" +
      "om_number\030\001 \001(\005\"?\n\027RoomTemperatureRespon" +
      "se\022\023\n\013temperature\030\001 \001(\001\022\017\n\007message\030\002 \001(\t" +
      "\"F\n\022TemperatureRequest\022\027\n\017set_room_numbe" +
      "r\030\001 \001(\005\022\027\n\017set_temperature\030\002 \001(\001\"C\n\023Temp" +
      "eratureResponse\022\033\n\023current_temperature\030\001" +
      " \001(\001\022\017\n\007message\030\002 \001(\t\"W\n\034AdjustRoomTempe" +
      "ratureRequest\022\027\n\017adj_room_number\030\001 \001(\005\022\036" +
      "\n\026temperature_adjustment\030\002 \001(\001\"M\n\035Adjust" +
      "RoomTemperatureResponse\022\033\n\023new_adj_tempe" +
      "rature\030\001 \001(\005\022\017\n\007message\030\002 \001(\t2\351\002\n\030Room_T" +
      "emperature_control\022c\n\022SetRoomTemperature" +
      "\022#.Smart.HR_Office.TemperatureRequest\032$." +
      "Smart.HR_Office.TemperatureResponse\"\0000\001\022" +
      "j\n\023ShowRoomTemperature\022\'.Smart.HR_Office" +
      ".RoomTemperatureRequest\032(.Smart.HR_Offic" +
      "e.RoomTemperatureResponse\"\000\022|\n\025AdjustRoo" +
      "mTemperature\022-.Smart.HR_Office.AdjustRoo" +
      "mTemperatureRequest\032..Smart.HR_Office.Ad" +
      "justRoomTemperatureResponse\"\000(\0010\001B\'\n\024tem" +
      "perature.service2B\rService2_ImplP\001b\006prot" +
      "o3"
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
    internal_static_Smart_HR_Office_RoomTemperatureRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Smart_HR_Office_RoomTemperatureRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_RoomTemperatureRequest_descriptor,
        new java.lang.String[] { "RoomNumber", });
    internal_static_Smart_HR_Office_RoomTemperatureResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Smart_HR_Office_RoomTemperatureResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_RoomTemperatureResponse_descriptor,
        new java.lang.String[] { "Temperature", "Message", });
    internal_static_Smart_HR_Office_TemperatureRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Smart_HR_Office_TemperatureRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_TemperatureRequest_descriptor,
        new java.lang.String[] { "SetRoomNumber", "SetTemperature", });
    internal_static_Smart_HR_Office_TemperatureResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Smart_HR_Office_TemperatureResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_TemperatureResponse_descriptor,
        new java.lang.String[] { "CurrentTemperature", "Message", });
    internal_static_Smart_HR_Office_AdjustRoomTemperatureRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Smart_HR_Office_AdjustRoomTemperatureRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_AdjustRoomTemperatureRequest_descriptor,
        new java.lang.String[] { "AdjRoomNumber", "TemperatureAdjustment", });
    internal_static_Smart_HR_Office_AdjustRoomTemperatureResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Smart_HR_Office_AdjustRoomTemperatureResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Smart_HR_Office_AdjustRoomTemperatureResponse_descriptor,
        new java.lang.String[] { "NewAdjTemperature", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}