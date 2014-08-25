package ahmed.castro.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Enemigo extends Image
{
	Enemigo()
	{
		super(new Texture("enemigo.png"));
	}
	
	public void act(float delta)
	{
		setX(getX()+1);
	}
}
