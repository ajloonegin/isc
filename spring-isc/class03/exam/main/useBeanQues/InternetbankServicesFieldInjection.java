package ir.freeland.spring.usebean;

@Component
public class InternetbankServicesFieldInjection {

    public void doCardToCard(String sourceCard, String destinationCard) {
        @Autowired
        private CardServices cardService;

        @Autowired
        private DatabaseManagment database;


        String result = cardService.cardToCard(sourceCard, destinationCard);
        database.save( result );

    }
}
