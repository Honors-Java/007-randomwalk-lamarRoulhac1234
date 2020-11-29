int steps = 0;
int x = 200;
int y = 200;

int n = (int)(Math.random() * 5);

void setup() {
	size(500, 500);
}
 void draw() {
 
  // You will need to make sure you dont draw more rectangles than the limit of steps
  //You'll need to use the Math.random() to decide how to create randomness in your drawing of rectangles.
  // Keep your canvas and rectangle width and height as I've given you


  if(x < 0){
    x = 0;
  }else if(x > 500){
    x = 500;
  }


  if(y < 0){
    y = 0;
  }else if(y > 500){
    y = 500;
  }

  if(steps == 1000){
    x = x;
    y = y;
    n = 5;
  }

  if(n == 0){
    y = y - 10;
    n = (int)(Math.random() * 5);
    steps = steps + 1;
    fill(0);
  }else if(n == 1){
    y = y + 10;
    n = (int)(Math.random() * 5);
    steps = steps + 1;
    fill(0);
  }else if(n == 2){
    x = x - 10;
    n = (int)(Math.random() * 5);
    steps = steps + 1;
    fill(0);
  }else if(n == 3){
    x = x + 10;
    n = (int)(Math.random() * 5);
    steps = steps + 1;
    fill(0);
  }else if(n == 5){
    x = x;
    y = y;
  }else{
    n = int(random(0, 3));
    steps = steps + 1;
    fill(0);
  }

  fill(255, 255, 255);
  rect(x, y, 10, 10);
  fill(0);
    println("drew rect at: " + x + ", " + y);
    println("Steps taken: " + steps);
}
