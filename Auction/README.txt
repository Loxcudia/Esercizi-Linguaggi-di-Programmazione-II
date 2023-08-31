La classe Auction rappresenta una vendita all’asta. Il suo costruttore accetta come argomento
il prezzo di partenza dell’asta. Il metodo makeOffer rappresenta la presentazione di un’offerta e
prende come argomenti l’ammontare dell’offerta e il nome dell’acquirente.
Un oggetto Auction deve accettare offerte, finchè non riceve offerte per 3 secondi consecutivi. A
quel punto, l’oggetto stampa a video l’offerta più alta e il nome del compratore.
Si supponga che più thread possano chiamare concorrentemente il metodo makeOffer dello stesso
oggetto.