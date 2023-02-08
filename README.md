# Hibernate_trobarError

Primer error:
Tenia que conectar la meva base de dades per poder funcionar el programa. 
  - Anar a hiberna.cfg.xml
  - Linea 12 "<property name="connection.url">jdbc:mysql://localhost:3306/cinema</property>"
    cambiar clientes per un de les databases teves.
  - Fer start a la classe App.java
Segon error:
  - He entes que en la classe entitat Direccion.java repeteix moltes columnes y sugereix que en mapejar posem (update= false, insert=false)
  - Doncs he posat al costat de cada @Column unes parentes y escrit "updatable= false, insertable= false"
