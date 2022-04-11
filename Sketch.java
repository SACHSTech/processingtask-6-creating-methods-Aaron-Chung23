import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	drawFirstFace(300,300);
  drawSecondFace(250, 60, 255, 192, 203, 0, 255);
  getParameters(width/2, height/2); 
    
  }

  private void drawFirstFace(int x, int y){

  //face
  fill(255,255,255);
  ellipse(x, y, width/6, height/6); 

  //Left hole
  fill(0,0,0);
  ellipse(x-10,y-15, width/40, height/40);

  //Right hole
  fill(0,0,0);
  ellipse(x+10, y-15, width/40, height/40); 
  
  fill(255,192,203);
  ellipse(x,y+10,width/40, height/60);

  }

  private void drawSecondFace(int x2, int y2, int faceColour, int faceColour2, int faceColour3, int eye, int eye2){
  //face
  fill(faceColour2,faceColour3,faceColour);
  ellipse(x2, y2, width/5, height/5); 
  
  //Left hole
  fill(eye,eye2,eye);
  ellipse(x2-20,y2-20, width/40, height/40);
  
  //Right hole
  fill(eye,eye2,eye);
  ellipse(x2+20, y2-20, width/40, height/40); 
  
  stroke(eye,eye,eye);
  line(x2-15, y2+10, x2+5, y2+20);

  stroke(eye,eye,eye);
  line(x2+5, y2+20, x2+25, y2+10);
  
  }

  private int getParameters(int placeX, int placeY){  
  
    fill(0,0,0);
    ellipse(placeX, placeY, 100, 100);

    return placeX + placeY;

  }
  // define other methods down here.
}