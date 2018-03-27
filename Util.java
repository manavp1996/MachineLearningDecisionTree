import java.util.*;
import java.io.*;

class Util {
  Util(){

  }
  void printAttrList(Scheme scheme) {
    for(Attribute a : scheme.attrList){
      System.out.println(a.name);
      for(String s : a.values) {
        System.out.print(s + " ");
      }
      System.out.println();
    }
  }
  void printSample(Sample sample){
    for(Example e : sample.examples){
      for(int i = 0; i<e.attributeValues.length; i++){
        System.out.print(e.attributeValues[i]+" ");
      }
      System.out.println();
    }
  }
}
