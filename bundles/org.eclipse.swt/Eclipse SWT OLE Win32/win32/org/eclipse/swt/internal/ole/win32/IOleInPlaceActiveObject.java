package org.eclipse.swt.internal.ole.win32;

/*
 * (c) Copyright IBM Corp. 2000, 2001.
 * All Rights Reserved
 */
import org.eclipse.swt.internal.win32.*;

public class IOleInPlaceActiveObject extends IOleWindow
{
public IOleInPlaceActiveObject(int address) {
	super(address);
}
public int TranslateAccelerator(MSG lpmsg) {
	  //lpmsg - Pointer to message that may need translating
	  return COM.VtblCall(5, address, lpmsg);
}
public int ResizeBorder(RECT prcBorder, int pUIWindow, boolean fFrameWindow) {
	return COM.VtblCall(8, address, prcBorder, pUIWindow, fFrameWindow);
}
}
