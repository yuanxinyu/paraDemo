/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cloog;

public class cloogdomain {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected cloogdomain(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(cloogdomain obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      CLooGJNI.delete_cloogdomain(swigCPtr);
    }
    swigCPtr = 0;
  }

  public SWIGTYPE_p_Polyhedron getPolyhedron() {
    long cPtr = CLooGJNI.cloogdomain_polyhedron_get(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Polyhedron(cPtr, false);
  }

  public int getReferences() {
    return CLooGJNI.cloogdomain_references_get(swigCPtr);
  }

  public cloogdomain() {
    this(CLooGJNI.new_cloogdomain(), true);
  }

}