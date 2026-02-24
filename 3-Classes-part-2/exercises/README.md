# Correcte output classes part 1

## oefening ex-line:

```
Begin punt X: 5
Begin punt Y: 8
End punt X: 12
End punt X: 17
Thickness: 2
Line starts at (5,8), line ends at (12,17) and the thickness is: 2
```

## oefening ex-refueling:

```
Previous Mileage: 12345
Current Mileage: 13456
Amount in liters: 40
Your fuel consumption was 3.6003600360036003 liters.
```

## oefening ex-thermostat:

```
Current temperature: 22
Temperature increased from 22 to 27
Temperature decreased from 27 to 19
Temperature decreased from 19 to 10
```


## oefening ex-parkingticketmachine:

```
You still need to insert at least 10 euros
```
# NOTE: bij deze oefening werken de tests niet in mijn oplossing. Dit komt omdat je een constructor moet maken op het einde van de oefening met de parameter price. De tests geven deze parameter niet mee via de constructor maar via de setPrice method. Als je de tests wilt laten werken zijn er 3 opties. 1. Haal de constructor weg en laat java er zelf 1 genereren. 2. Haal de price parameter weg uit de constructor zodat deze niet meegeven moet worden. 3. Maak nog een constructor zonder parameters zodat de tests kunnen overloaden naar deze constructor waar geen parameter moet meegegeven worden. Dit is de beste oplossing
