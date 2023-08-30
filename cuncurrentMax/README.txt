Implementare il metodo statico concurrentMax, che accetta un riferimento ad una matrice di
interi e restituisce il massimo valore presente nella matrice. Internamente, il metodo crea tanti
thread quante sono le righe della matrice. Ciascuno di questi thread ricerca il massimo all’interno
della sua riga e poi aggiorna il massimo globale.
É necessario evitare race condition ed attese attive.