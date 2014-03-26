void setup()
{
  Serial.begin(9600);
}

void loop()
{
   // send data only when you receive data:
        if (Serial.available() > 0) 
        {
                // read the incoming byte:
                int incomingByte = Serial.read();
                Serial.write(incomingByte);
        }
      
}
