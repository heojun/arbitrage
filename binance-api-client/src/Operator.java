
import java.util.List;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.TickerPrice;

public class Operator {
	public static void main(String args[]){
		String key = "";
		String secret = "";
		BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance(key, secret);
		BinanceApiRestClient client = factory.newRestClient();
		
		while(true){
			List<TickerPrice> allPrices = client.getAllPrices();
			for(TickerPrice coin : allPrices){
				System.out.printf("%20s %20s\n", coin.getSymbol(), coin.getPrice());
			}
		}
	}
	
	
}
