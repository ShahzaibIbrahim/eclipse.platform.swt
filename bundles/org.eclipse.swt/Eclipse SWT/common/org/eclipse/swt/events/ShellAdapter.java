package org.eclipse.swt.events;

/*
 * (c) Copyright IBM Corp. 2000, 2001.
 * All Rights Reserved
 */

/**
 * This adapter class provides default implementations for the
 * methods described by the <code>ShellListener</code> interface.
 * <p>
 * Classes that wish to deal with <code>ShellEvent</code>s can
 * extend this class and override only the methods which they are
 * interested in.
 * </p>
 *
 * @see ShellListener
 * @see ShellEvent
 */
public abstract class ShellAdapter implements ShellListener {

/**
 * Sent when a shell becomes the active window.
 * The default behavior is to do nothing.
 *
 * @param e an event containing information about the activation
 */
public void shellActivated(ShellEvent e) {
}

/**
 * Sent when a shell is closed.
 * The default behavior is to do nothing.
 *
 * @param e an event containing information about the close
 */
public void shellClosed(ShellEvent e) {
}

/**
 * Sent when a shell stops being the active window.
 * The default behavior is to do nothing.
 *
 * @param e an event containing information about the deactivation
 */
public void shellDeactivated(ShellEvent e) {
}

/**
 * Sent when a shell is un-minimized.
 * The default behavior is to do nothing.
 *
 * @param e an event containing information about the un-minimization
 */
public void shellDeiconified(ShellEvent e) {
}

/**
 * Sent when a shell is minimized.
 * The default behavior is to do nothing.
 *
 * @param e an event containing information about the minimization
 */
public void shellIconified(ShellEvent e) {
}
}
