package ahmed.castro.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Cohete extends Image{
	Cohete()
	{
		super(new Texture("cohete.png"));
		MiListener mi_listener = new MiListener(this);
		addListener(mi_listener);
	}
}
