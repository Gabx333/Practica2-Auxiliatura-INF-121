class Producto:
    def __init__(self, codigo, nombre, precio, stock):
        self.codigo = codigo
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def getCodigo(self):
        return self.codigo

    def getNombre(self):
        return self.nombre

    def getPrecio(self):
        return self.precio

    def getStock(self):
        return self.stock

    def setStock(self, stock):
        self.stock = stock

class Inventario:
    def __init__(self):
        self.productos = []  # Igual que tu ArrayList

    def agregarProducto(self, p):
        try:
            for prod in self.productos:
                if prod.getCodigo() == p.getCodigo():
                    raise Exception(f"El producto con código {p.getCodigo()} ya existe")
            if p.getPrecio() < 0 or p.getStock() < 0:
                raise Exception("Precio o stock no pueden ser negativos")
            self.productos.append(p)
            print(f"Producto {p.getNombre()} agregado correctamente.")
        except Exception as e:
            print(f"Error al agregar producto {p.getNombre()}: {e}")

    def buscarProducto(self, codigo):
        try:
            encontrado = False
            for p in self.productos:
                if p.getCodigo() == codigo:
                    print(f"Producto encontrado: {p.getNombre()}, Precio: {p.getPrecio()}, Stock: {p.getStock()}")
                    encontrado = True
                    break
            if not encontrado:
                raise Exception(f"Producto con código {codigo} no encontrado")
        except Exception as e:
            print(f"Error: {e}")

    def venderProducto(self, codigo, cantidad):
        try:
            producto = None
            for p in self.productos:
                if p.getCodigo() == codigo:
                    producto = p
                    break
            if producto is None:
                raise Exception(f"Producto con código {codigo} no encontrado")
            if producto.getStock() >= cantidad:
                producto.setStock(producto.getStock() - cantidad)
                print(f"Se vendieron {cantidad} unidades de {producto.getNombre()}. " f"Stock restante: {producto.getStock()}")
            else:
                raise Exception(f"Stock insuficiente para {producto.getNombre()}. "
                                f"Disponible: {producto.getStock()}")
        except Exception as e:
            print(f"Error: {e}")


inv = Inventario()

p1 = Producto("001", "Mouse", 25.0, 10)
p2 = Producto("002", "Teclado", 40.0, 5)
p3 = Producto("001", "Monitor", 150.0, 3)  

inv.agregarProducto(p1)
inv.agregarProducto(p2)
inv.agregarProducto(p3)  

inv.venderProducto("001", 3)   
inv.venderProducto("002", 10)
inv.venderProducto("003", 1) 
inv.buscarProducto("002")      
inv.buscarProducto("004")      