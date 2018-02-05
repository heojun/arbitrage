package execute;

import java.util.List;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.TickerPrice;

public class Operator {
	public static void main(String args[]){
		String key = "rKdAEdtCT8kI2cZPotYpCEoacf3AKXavwYKSp60ZYB9rYzcvEzINuZqCQg67s8c3";
		String secret = "ByXsn2UtIuXJkHXKWN5iUJ7k2vxy229rvuzy9z5XwUWOcyhxV3A7Yrie8Ij7N2qu";
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
