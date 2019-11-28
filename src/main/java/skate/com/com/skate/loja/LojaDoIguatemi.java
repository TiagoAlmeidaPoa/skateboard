package skate.com.com.skate.loja;

import skate.com.com.skate.skate.Skate;
import skate.com.com.skate.skate.SkateBasicoIguatemi;

public class LojaDoIguatemi extends Loja {

	@Override
	protected Skate criarSkate(String modelo) {

		switch (modelo) {
		case "basico":
			return new SkateBasicoIguatemi();
		}

		return null;
	}

}
