class Falling
{
float y = random(-height,-70);
float yspeed = random(fall.length);
float x = random(width);
color c = color(random(255),random(255),random(255));
int counterpotatoes = -1;
void drop()
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
