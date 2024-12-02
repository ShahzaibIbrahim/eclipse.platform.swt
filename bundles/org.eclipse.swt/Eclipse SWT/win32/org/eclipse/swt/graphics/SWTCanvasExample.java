package org.eclipse.swt.graphics;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class SWTCanvasExample {
    public static void main(String[] args) {
        // Create a Display and Shell
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("SWT PaintListener Example");
        shell.setSize(400, 300);
        String outString = "Hello SWT!";
        // Create a Canvas
        Canvas canvas = new Canvas(shell, SWT.NONE);

        // Add a PaintListener to the Canvas
        canvas.addPaintListener(e -> {
		    GC gc = e.gc;
		    gc.setAdvanced(true);
		    gc.setTextAntialias(SWT.ON);

		    System.out.println("Before = " + gc.getFontMetrics().getHeight());
		    gc.stringExtent(outString);

		    // Draw a rectangle as an example
		    gc.drawRectangle(50, 50, 100, 100);

		    // Optionally, draw a string
		    gc.drawString(outString, 60, 60);
		    System.out.println("After = " + gc.getFontMetrics().getHeight());
		});

     // Add a MouseMoveListener to trigger painting on hover
        canvas.addMouseMoveListener(e -> canvas.redraw());

        // Open the Shell and run the event loop
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }

        // Dispose of the Display
        display.dispose();
    }
}
