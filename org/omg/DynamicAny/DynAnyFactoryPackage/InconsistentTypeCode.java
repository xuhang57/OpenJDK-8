package org.omg.DynamicAny.DynAnyFactoryPackage;


/**
* org/omg/DynamicAny/DynAnyFactoryPackage/InconsistentTypeCode.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-8-OqY7zN/openjdk-8-8u222-b10/src/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Thursday, July 18, 2019 8:39:37 PM UTC
*/

public final class InconsistentTypeCode extends org.omg.CORBA.UserException
{

  public InconsistentTypeCode ()
  {
    super(InconsistentTypeCodeHelper.id());
  } // ctor


  public InconsistentTypeCode (String $reason)
  {
    super(InconsistentTypeCodeHelper.id() + "  " + $reason);
  } // ctor

} // class InconsistentTypeCode
