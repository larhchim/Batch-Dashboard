L’équipe business intelligence au sein de l’EURAFRIC INFORMATION a déjà mis en place
une application synthèse d’équipements qui gère le référentiel Image contrat (ICN) ce dernier
n’est plus ni moins qu’une base de données alimentés par un traitement batch (traitement de
masse) qui récupère l’ensemble de ces données à partir des systèmes opérants tel que S1 :
système de gestion des comptes, S2 : système de gestions des cartes, S3 : système de gestion
des crédits ….Etc. chaque système est caractérisé par des évènements comme la clôture, le
transfert, la souscription
cad on peut par exemple clôturer un compte lors du besoin ,transférer un compte ou bien
créer un nouveau compte ainsi de suite.
Le ICN constitue dans un premier temps l’ensemble des informations généré des systèmes
opérants tel quel, après ces données sont intégré sur plusieurs tables (tables des transactions
effectués avec succès (lignes intégrés avec succès), table des transactions échouées…etc.).
Le traitement batch sert à exécuter automatiquement à la fin de chaque journée ce flux de
travail sans intervention humaine.
La solution qu’on essaie de présenter est une application web basée sur le résultat de ICN
notre application contient deux volets principaux.
Le premier est la consultation des lignes qui sont bien intégrés avec succès et aussi le détail
sur les rejets selon type de rejet ou motif de rejet et aussi par systèmes ainsi que le suivi des
évènements contrats, la visualisation de différents sorts à partir des fichiers qui sont avec des
limiteurs aussi, est-ce qu’ils sont bien intégrés ou pas, savoir est ce que les fichiers générés
par les systèmes sont mal écrit, ou bien il s’est effectué une clôture d’un compte x alors que ce
dernier ne se trouve même pas au niveau d’ICN …etc., ensuite l’administrateur peut exporter
ces informations sous formats PDF ou xlsx.
Le deuxième volet est un indicateur ou tableau de bord qui sert à présenter les statistiques des
transactions de manière graphique une vision clair et synthétique de taux de rejets sur une
durée bien spécifiée au moment de l’interrogation aussi la visualisation des taux de
transactions effectuées avec succès par le système sous forme de charts graphiques.
La solution apportée serait tellement bénéfique en termes de temps de recherche en faveur de
l’administrateur qui va se contenter d’avoir toutes les informations sur une seule plate-forme
web en seulement deux volets simple à utiliser et consulter. 
