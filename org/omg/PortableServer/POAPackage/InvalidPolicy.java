package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/InvalidPolicy.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-8-OqY7zN/openjdk-8-8u222-b10/src/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, July 18, 2019 8:39:37 PM UTC
*/

public final class InvalidPolicy extends org.omg.CORBA.UserException
{
  public short index = (short)0;

  public InvalidPolicy ()
  {
    super(InvalidPolicyHelper.id());
  } // ctor

  public InvalidPolicy (short _index)
  {
    super(InvalidPolicyHelper.id());
    index = _index;
  } // ctor


  public InvalidPolicy (String $reason, short _index)
  {
    super(InvalidPolicyHelper.id() + "  " + $reason);
    index = _index;
  } // ctor

} // class InvalidPolicy
