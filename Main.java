print("BIENVENIDO A EAFIT SMART FOOD")
nombrecompleto = input("Ingresa tu nombre completo: ")
correo = input("Ingresa tu correo electronico: ")
if correo.find("@eafit.edu.co") != -1:
    imprimir("")
demás:
    print("(ERROR) El correo debe ser institucional")
contraseña = input("Ingresa tu contraseña: ")

# Definir una lista de comidas y sus caracteristicas
comidas = [
    {"nombre": "Pizza", "vegetariana": Falso, "picante": Falso, "saludable": Falso},
    {"nombre": "Hamburguesa", "vegetariana": Falso, "picante": Falso, "saludable": Falso},
    {"nombre": "Perro", "vegetariana": Falso, "picante": Falso, "saludable": Falso},
    {"nombre": "Carne", "vegetariana": Falso, "picante": Falso, "saludable": Verdadero},
    {"nombre": "Pollo", "vegetariana": Falso, "picante": Falso, "saludable": Verdadero},
    {"nombre": "Pasta", "vegetariana": Falso, "picante": Falso, "saludable": Verdadero},
    {"nombre": "Salchipapa", "vegetariana": Falso, "picante": Falso, "saludable": Falso},
    {"nombre": "torta", "vegetariana": Falso, "picante": Falso, "saludable": Verdadero},
    {"nombre": "sopa", "vegetariana": Falso, "picante": Falso, "saludable": Verdadero},
    {"nombre": "Sándwich", "vegetariana": Verdadero, "picante": Falso, "saludable": Verdadero},
    {"nombre": "Papas a la francesa", "vegetariana": Falso, "picante": Falso, "saludable": Falso},
]
print("SUGERENCIAS")
print("Perro grande = $12.900")
imprimir("FRISNACK GRANDE = $22.100")
print("FRISCOMBO CLASICO = $17.900")



print("TE REALIZAMOS UNAS PEQUEÑAS PREGUNTAS")
# Pedir al usuario sus preferencias
vegetariana = input("¿Te gusta la comida vegetariana? (si/no): ").lower() == "si"
picante = input("¿Te gusta la comida picante? (si/no): ").lower() == "si"
saludable = input("¿Quieres una comida saludable? (si/no): ").lower() == "si"

# Filtrar la lista de comidas según las preferencias del usuario
comidas_filtradas = []
para comida en comidas:
    if comida["vegetariana"] == vegetariana and comida["picante"] == picante and comida["saludable"] == saludable:
        comidas_filtradas.append(comida)

#Mostrar las comidas recomendadas
si len(comidas_filtradas) == 0:
    print("Lo siento, no hay comidas que coincidan con tus preferencias.")
demás:
    print("Te recomendamos estas comidas:")
    para comida en comidas_filtradas:
        print("- " + comida["nombre"])
