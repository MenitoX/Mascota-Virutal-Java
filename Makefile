
JAVAC=javac
JAVA=java

# Define .java and .class files
SOURCES=Estado.java Inventario.java Item.java Main.java Mascota.java
CLASSES=$(SOURCES:.java=.class)

# Default target
all: $(CLASSES)

# Rule for creating .class from .java
%.class: %.java
	$(JAVAC) $<

# Target to clean the directory
clean:
	rm -f *.class

# Target to run the program, assumes config.csv as input
run: all
	$(JAVA) Main config.csv
