Implementare la classe RandomExecutor che esegue degli oggetti Runnable sequenzialmente e in
ordine casuale. Precisamente, la classe offre un costruttore senza argomenti e i seguenti metodi:
• Il metodo void addTask(Runnable r) aggiunge un task. Questo metodo può essere chiamato
solo prima di launch.
• Il metodo void launch() avvia l’esecuzione dei task. Questo metodo non è bloccante.
• Il metodo bloccante void join(Runnable r) attende la terminazione del corrispondente task.
Questo metodo può essere chiamato prima o dopo launch.