public class DrawSolarSystem {

    public static void main(String[] args) {
        double movingAngle = 0;
        Star sol = new Star(1200, 1000);
        

       
        while (true) {

            movingAngle++; 
            sol.drawSolarObject(0, 0, 100, "YELLOW");// Drawing the sun
            sol.drawSolarObject(70, movingAngle*3, 12, "DARK_GRAY"); // Drawing of mercury
            sol.drawSolarObject(100, movingAngle*2, 25, "ORANGE"); //venus
            sol.drawSolarObject(150, movingAngle, 30, "BLUE"); // earth
            sol.drawSolarObjectAbout(25, movingAngle*2, 7, "GREY", 150, movingAngle ); // drawing of moon, centre of rotation dist is
                                                                                                                            // the coordinate of the planet that the moon orbits.

            sol.drawSolarObject(220, movingAngle-10, 22, "RED"); //msrs
            for (int i = 0; i< 2; i++) { 
                sol.drawSolarObjectAbout(20, movingAngle *1.1, 8, "RED", 220, movingAngle -10);// drawing mars' two moons
                sol.drawSolarObjectAbout(37, movingAngle *1.2, 8, "RED", 220, movingAngle-10);
            }                                                                                                                
            
            sol.drawSolarObject(330, movingAngle* 0.8, 60, "YELLOW"); ///satrun

            for (int i = 0; i< 360  ; i++) { 
                sol.drawSolarObjectAbout(50, movingAngle+ i, 8, "WHIE", 330, movingAngle *0.8);// drawing saturn ring
            }

            sol.drawSolarObject(440, movingAngle*0.5, 80, "ORANGE"); // jupiter
            
             sol.finishedDrawing();
        }
    }
}
