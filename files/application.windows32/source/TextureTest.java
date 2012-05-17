import processing.core.*; 
import processing.xml.*; 

import processing.opengl.*; 
import peasy.*; 
import shapes3d.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class TextureTest extends PApplet {






PeasyCam cam;
Box head;
double rotX, rotY;

int swid, shei;
public void setup() {
  //set cam
  cam = new PeasyCam(this, 200);
  cam.setMinimumDistance(150);
  cam.setMaximumDistance(500);
  size(640, 480, OPENGL);
  //set box
  head = new Box(this);
  String[] faces = new String[] {
    "front.jpg", "back.jpg", "right.jpg", 
    "left.jpg", "bottom.jpg", "top.jpg"
  };
  head.setTextures(faces);
  head.setSize(100, 100, 100);
  head.drawMode(Shape3D.TEXTURE | Shape3D.WIRE);
  rotX = 0;
  rotY = 0;
}
public void draw() {
  background(255);
  head.draw();
  //butFront.display();
  cam.rotateY(rotY);
  cam.rotateX(rotX);
}
public void keyPressed() {
  if (key == ' ') {
    cam.reset();
    rotX = 0;
    rotY = 0;
  }
  if (key == CODED) {
    if (keyCode == LEFT) {
      rotY = rotY + 0.01f;
    }
    if (keyCode == RIGHT) {
      rotY = rotY - 0.01f;
    }
    if (keyCode == UP) {
      rotX = rotX + 0.01f;
    }
    if (keyCode == DOWN) {
      rotX = rotX - 0.01f;
    }
  }
}

  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "TextureTest" });
  }
}
