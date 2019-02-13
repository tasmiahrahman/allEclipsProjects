package myTryPageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public class WomenPage extends LoadableComponent<WomenPage> {
	ChromeDriver dr;

	public WomenPage(ChromeDriver wr) {
		dr = wr;
	}

	@Override
	protected void load() {
dr.navigate().to("https://www.ugg.com/on/demandware.store/Sites-UGG-US-Site/default/Default-Start?gclid=EAIaIQobChMI_KqDi6vK3gIVnISzCh2IkA0BEAAYASAAEgJviPD_BwE&gclsrc=aw.ds&source=ggl_ppc");
	}

	@Override
	protected void isLoaded() throws Error {
Assert.assertTrue(dr.getCurrentUrl().equals("https://www.ugg.com/on/demandware.store/Sites-UGG-US-Site/default/Default-Start?gclid=EAIaIQobChMI_KqDi6vK3gIVnISzCh2IkA0BEAAYASAAEgJviPD_BwE&gclsrc=aw.ds&source=ggl_ppc"));
	}

}
