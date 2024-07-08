# `Explore Salento`

## Presentazione del Progetto
Explore Salento è un'app progettata per rivoluzionare il modo in cui i turisti scoprono, prenotano e vivono esperienze uniche nella nostra affascinante zona turistica. L'app offre una piattaforma user-friendly che favorisce l'interazione tra gli utenti e la recensione delle attività.

## Funzionalità Principali

### Prenotazione di Esperienze/Attività
- **Cerca e Prenota**: Gli utenti possono cercare e prenotare una vasta gamma di attività ed esperienze locali. 
- **Visualizzazione delle Date Disponibili e delle Fasce Orarie**
- **Dettagli dell'Attività**: Descrizioni dettagliate, immagini, video, prezzo.
- **Notifiche**: Notifiche e-mail e push per confermare le prenotazioni tramite Email Sender. 

### Interazione tra gli Utenti
- **Chat e Messaggi**: Sistema di messaggistica interno per comunicare con altri utenti e organizzatori di attività.

### Recensione delle Attività
- **Lasciare Recensioni e Valutazioni**: Gli utenti possono lasciare recensioni e valutazioni delle attività, aiutando gli altri a prendere decisioni. 
- **Sistema di Valutazione**: Valutazione a stelle e commenti dettagliati. 
- **Foto e Video Recensioni**: Possibilità di aggiungere foto e video per testimoniare l'esperienza.

### Contenuti Esclusivi
- **Contenuti Personalizzati**: Offriamo contenuti esclusivi e personalizzati per gli utenti registrati, migliorando l'esperienza complessiva.
- **Guide, Suggerimenti e Video**: Realizzati da esperti locali come parte dell'esperienza. 

### Premi e Riconoscimenti
- **Guadagno di Punti**: Gli utenti guadagnano punti per ogni prenotazione, recensione.

## Obiettivo del Progetto
L'obiettivo del progetto è fornire una piattaforma che consenta ai turisti di scoprire, prenotare e vivere esperienze uniche nella mia zona.

## Tecnologie Utilizzate
- **Backend**: Java e Spring Boot
- **Frontend**: Bootstrap e Angular
- **Database**: PostgreSQL

## Dettagli dell'Implementazione
- **Per quanto riguarda il back end, ho utilizzato Java insieme al framework Spring. Spring è stato essenziale per la gestione della logica di business, dell'inversione del controllo (IoC) e dell'integrazione con altre componenti del sistema. Questo ha permesso una struttura del codice più modulare e facilmente manutenibile.

Per la gestione dei dati, ho creato un database PostgreSQL. PostgreSQL è stato scelto per la sua robustezza, scalabilità e per il supporto alle query SQL avanzate. Ho definito le tabelle, le relazioni e le viste necessarie per supportare le funzionalità del progetto. Inoltre, ho utilizzato le funzionalità di mapping oggetti-relazionale (ORM) di Spring Data JPA per facilitare le operazioni di CRUD (Create, Read, Update, Delete) sul database.

Una volta che il back end era a posto, mi sono concentrato sul front end utilizzando Angular. Angular è un framework potente per la costruzione di applicazioni web dinamiche e single-page applications (SPA). Ho integrato il front end con il back end tramite chiamate HTTP, utilizzando il modulo HttpClient di Angular. Questo ha permesso una comunicazione fluida tra il client e il server, consentendo il recupero e l'invio dei dati in modo asincrono.

L'intera architettura del progetto è stata progettata per essere scalabile e facile da mantenere. Grazie a Spring, la logica di business è ben organizzata e separata dalle altre componenti, mentre PostgreSQL assicura una gestione efficace dei dati. Angular, infine, offre un'interfaccia utente reattiva e interattiva, migliorando l'esperienza dell'utente finale.

Allego il link del mio front end Angular: https://github.com/martella93/front-capstone.

Questo progetto ha rappresentato una sfida interessante, ma anche un'opportunità per approfondire l'uso di queste tecnologie e per implementare un sistema completo end-to-end.

