package module6;
import processing.core.PConstants;
import processing.core.PGraphics;
import processing.core.PImage;
import processing.core.PApplet;
public class DrawCityMarker extends PApplet {

	private PImage backgroundImage;
	public void drawMy(PGraphics pg,float x, float y) {
			
		backgroundImage=loadImage("https://media.contentapi.ea.com/content/dam/gin/images/2017/01/simcity-3000-unlimited-keyart.jpg.adapt.crop1x1.767p.jpg", "jpg");
		backgroundImage.resize(15,15);
		pg.image(backgroundImage,x,y);
}
}
