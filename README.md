# OMNITRACKER Documentation Microservice

This microservice accesses the OMNITRACKER database on behalf of [OMNITRACKER Database Binding](https://github.com/debuglevel/omnitrackerdatabasebinding), reads all folders, fields and their descriptions and delivers them as JSON.

## Get all folders with their fields and descriptions
`curl -X GET http://localhost:80/folders/`
```
[
  {
    "name": "(Alle Ordner)",
    "path": "\\(Alle Ordner)",
    "fields": []
  },
  {
    "name": "01. ITSM - Service Operation",
    "path": "\\(Alle Ordner)\\01. ITSM - Service Operation",
    "fields": [
      {
        "name": "Anfrageart",
        "description": "Art der Anfrage um die Requests zwischen \"Incident\" und \"Services Request\" zu unterscheiden"
      },
      {
        "name": "Haupt-Ticket"
      },
      {
        "name": "Synchronisation Kommunikation"
      },
      [...]
```