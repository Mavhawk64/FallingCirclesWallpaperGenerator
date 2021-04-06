import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class EdgarGame extends PApplet {

Falling [] fall = new Falling[250];
long count = 0;
int colorX = color(random(255),random(255),random(255));
public void setup()
{
  
  for(int i = 0; i < fall.length; i++)
  {
    fall[i] = new Falling();
  }
}

public void draw()
{
  count++;
  if(keyPressed && count >= 50)
  {
  colorX = color(random(255),random(255),random(255));
  count = 0;
  }
  background(colorX);
  for(int i = 0; i < fall.length; i++)
  {
    fall[i].drop();
    //fall[i].show();
  }
}
class Falling
{
float y = random(-height,-70);
float yspeed = random(fall.length);
float x = random(width);
int c = color(random(255),random(255),random(255));
int counterpotatoes = -1;
public void drop()
{
  if(counterpotatoes == 0)
  {
    counterpotatoes = -1000;
    c = color(random(255),random(255),random(255));
  }
  //counterpotatoes++;
  fill(c);
  noStroke();
  circle(x,y,70);
  yspeed++;
  y+=yspeed/10;
  if(y > height)
  {
    y = random(-height,-70);
    yspeed = random(mouseX/5);
  }
}
}
  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--hide-stop", "EdgarGame" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
