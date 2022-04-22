import org.example.exchange.Exchange;
import org.example.provider.EuroExchange;
import org.example.provider.SEKExchange;

module org.example.provider {
    requires org.example.exchange;
    provides Exchange with EuroExchange, SEKExchange;
}