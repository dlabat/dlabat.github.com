void setup() {
  size(screenWidth, 150);
  colorMode(HSB, width, 100, 100, 1);
  smooth();
}
void draw() {
  background(0, 0);
  for (int i = 0; i < width; i = i+2) {
    stroke(abs(i - mouseX), 100, 100);
    line(i,150,i,0);
  }
}
