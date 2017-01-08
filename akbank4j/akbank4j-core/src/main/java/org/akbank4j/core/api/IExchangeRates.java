package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.ExchangeRatesModel;

/**
 * ExchangeRates API size güncel ve geçmiş döviz kurları edinmenize izin verir.
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface IExchangeRates {

  /**
   * Güncel dövüz kuru verir.
   * <pre>{@code Akbank4J<ExchangeRatesModel> exchangeRate = akbank.getExchangeRates();}</pre>
   *
   * @return Akbank4J<ExchangeRatesModel>
   */
  public Akbank4J<ExchangeRatesModel> getExchangeRates();

  /**
   * isTwoParam false ise; parametre tipi ve değeri gönderilir.
   * <pre>{@code Akbank4J<ExchangeRatesModel> exchangeRate = akbank.getExchangeRates(AkbankParameters.ExchangeRates.DATE, "2016-02-01", false);}
   * Akbank4J<ExchangeRatesModel> exchangeRate = akbank.getExchangeRates(AkbankParameters.ExchangeRates.CURRENCY_CODE, "002", false);</pre>
   * isTwoParam true ise; iki tane parametre aynı anda gönderilecektir. İlk parametreye currencyCode, ikinci parametreye
   * date yazılır.
   * <pre>{@code Akbank4J<ExchangeRatesModel> exchangeRate = akbank.getExchangeRates("001", "2015-10-08", true);}</pre>
   *
   * @param param
   * @param value
   * @param isTwoParam
   *
   * @return Akbank4J<ExchangeRatesModel>
   */
  public Akbank4J<ExchangeRatesModel> getExchangeRates(String param, String value, boolean isTwoParam);

}
