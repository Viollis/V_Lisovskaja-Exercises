package lt.techin.municipality.test;

import lt.techin.municipality.Municipality;
import lt.techin.municipality.TaxCalculator;
import lt.techin.municipality.TaxRateProvider;

public class MunicipalityTest extends AbstractMunicipalityTest {
    @Override
    public Municipality getMunicipality(TaxCalculator taxCalculator) {
        return new MunicipalityImplementation();
    }

    @Override
    public TaxCalculator getTaxCalculator(TaxRateProvider taxRateProvider) {
        return new TaxCalculatorImplementation();
    }
}
