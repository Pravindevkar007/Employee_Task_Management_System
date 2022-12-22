package com.sunbeam;
public class Single
{
  private static Single instance;
  public String string;
  private Single ()
  {
    string = "Welcome to TechVidvan's Tutorial of Java";
  }
  public static Single getInstance()
  {
    if (instance == null)
    {
      instance = new Single ();
    }
    return instance;
  }
  public static void main(String args[])
  {
	Single text = Single.getInstance();
    System.out.println("The String is:");
    System.out.println(text.string);
  }
}