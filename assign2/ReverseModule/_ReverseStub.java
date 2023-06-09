package ReverseModule;


/**
* ReverseModule/_ReverseStub.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ReverseModule.idl
* Friday, May 19, 2023 11:00:10 AM GMT
*/

public class _ReverseStub extends org.omg.CORBA.portable.ObjectImpl implements ReverseModule.Reverse
{
  // Constructors
  // NOTE:  If the default constructor is used, the
  //        object is useless until _set_delegate (...)
  //        is called.
  public _ReverseStub ()
  {
    super ();
  }

  public _ReverseStub (org.omg.CORBA.portable.Delegate delegate)
  {
    super ();
    _set_delegate (delegate);
  }

  public String reverse_string (String str)
  {
    org.omg.CORBA.portable.InputStream _in = null;
    try {
       org.omg.CORBA.portable.OutputStream _out = _request ("reverse_string", true);
       _out.write_string (str);
       _in = _invoke (_out);
       String __result = _in.read_string ();
       return __result;
    } catch (org.omg.CORBA.portable.ApplicationException _ex) {
       _in = _ex.getInputStream ();
       String _id = _ex.getId ();
       throw new org.omg.CORBA.MARSHAL (_id);
    } catch (org.omg.CORBA.portable.RemarshalException _rm) {
       return reverse_string (str);
    } finally {
        _releaseReply (_in);
    }
  } // reverse_string

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ReverseModule/Reverse:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s)
  {
     try 
     {
       String str = s.readUTF ();
       org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init ().string_to_object (str);
       org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
       _set_delegate (delegate);
     } catch (java.io.IOException e) {}
  }

  private void writeObject (java.io.ObjectOutputStream s)
  {
     try 
     {
       String str = org.omg.CORBA.ORB.init ().object_to_string (this);
       s.writeUTF (str);
     } catch (java.io.IOException e) {}
  }
} // class _ReverseStub
