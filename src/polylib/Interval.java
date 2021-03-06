package polylib;


/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Interval {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Interval(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Interval obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      PolylibJNI.delete_Interval(swigCPtr);
    }
    swigCPtr = 0;
  }

  public int getMaxN() {
    return PolylibJNI.Interval_MaxN_get(swigCPtr);
  }

  public int getMaxD() {
    return PolylibJNI.Interval_MaxD_get(swigCPtr);
  }

  public int getMinN() {
    return PolylibJNI.Interval_MinN_get(swigCPtr);
  }

  public int getMinD() {
    return PolylibJNI.Interval_MinD_get(swigCPtr);
  }

  public int getMaxI() {
    return PolylibJNI.Interval_MaxI_get(swigCPtr);
  }

  public int getMinI() {
    return PolylibJNI.Interval_MinI_get(swigCPtr);
  }

  public Interval() {
    this(PolylibJNI.new_Interval(), true);
  }

}
