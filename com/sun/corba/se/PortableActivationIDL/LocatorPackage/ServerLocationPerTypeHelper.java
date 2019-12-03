package com.sun.corba.se.PortableActivationIDL.LocatorPackage;


/**
* com/sun/corba/se/PortableActivationIDL/LocatorPackage/ServerLocationPerTypeHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-8-OqY7zN/openjdk-8-8u222-b10/src/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Thursday, July 18, 2019 8:39:36 PM UTC
*/

abstract public class ServerLocationPerTypeHelper
{
  private static String  _id = "IDL:PortableActivationIDL/Locator/ServerLocationPerType:1.0";

  public static void insert (org.omg.CORBA.Any a, com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "hostname",
            _tcOf_members0,
            null);
          _tcOf_members0 = com.sun.corba.se.PortableActivationIDL.ORBPortInfoHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (com.sun.corba.se.PortableActivationIDL.ORBPortInfoListHelper.id (), "ORBPortInfoList", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "ports",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerTypeHelper.id (), "ServerLocationPerType", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerType read (org.omg.CORBA.portable.InputStream istream)
  {
    com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerType value = new com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerType ();
    value.hostname = istream.read_string ();
    value.ports = com.sun.corba.se.PortableActivationIDL.ORBPortInfoListHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerType value)
  {
    ostream.write_string (value.hostname);
    com.sun.corba.se.PortableActivationIDL.ORBPortInfoListHelper.write (ostream, value.ports);
  }

}
