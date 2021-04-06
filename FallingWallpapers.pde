Falling [] fall = new Falling[250];
long count = 0;
color colorX = color(random(255),random(255),random(255));
void setup()
{
  fullScreen();
  for(int i = 0; i < fall.length; i++)
  {
    fall[i] = new Falling();
  } 
}

void draw()
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
