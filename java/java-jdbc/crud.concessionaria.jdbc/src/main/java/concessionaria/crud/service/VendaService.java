package concessionaria.crud.service;

public class VendaService {

    private static final VendaService INSTANCE = new VendaService();

    private VendaService(){}

    public static VendaService getInstance(){
        return INSTANCE;

    }
}
