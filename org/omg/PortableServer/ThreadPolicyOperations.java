package org.omg.PortableServer;


/**
* org/omg/PortableServer/ThreadPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-8-OqY7zN/openjdk-8-8u222-b10/src/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, July 18, 2019 8:39:37 PM UTC
*/


/**
	 * The ThreadPolicy specifies the threading model 
	 * used with the created POA. The default is 
	 * ORB_CTRL_MODEL.
	 */
public interface ThreadPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
  	 * specifies the policy value
  	 */
  org.omg.PortableServer.ThreadPolicyValue value ();
} // interface ThreadPolicyOperations
