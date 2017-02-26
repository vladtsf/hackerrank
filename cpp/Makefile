CC=g++
CFLAGS=-std=c++11

TARGET = a-very-big-sum

all: $(TARGET)

$(TARGET): src/$(TARGET).cpp
	$(CC) $(CFLAGS) -o bin/$(TARGET) src/$(TARGET).cpp

clean:
	$(RM) bin/$(TARGET)