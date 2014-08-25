package ahmed.castro.juego;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MiListener extends ClickListener 
{
	Cohete cohete;
	MiListener(Cohete cohete)
	{
		this.cohete = cohete;
	}
	
	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		super.touchDown(event, x, y, pointer, button);
		System.out.println("Estoy presionando!");
		cohete.setX(cohete.getX()+1);
		return true;
	}
}
