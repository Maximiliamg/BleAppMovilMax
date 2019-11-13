package com.example.bleappmovil.info;

public class Req {
    /*

    • The app must detect and present to the final user if the mobile device supports BLE or not
    UI: DONE!
    DONE: MAX

    • The app must detect and present if the Bluetooth deviceAdapter is turned on/off
    UI: DONE!
    DONE: MAX

    • The app must be able to turn on/off the Bluetooth deviceAdapter and require all the permissions
    needed to work
    DONE: MAX

    • After all the requirements are met, the application must show a first screen that list all the
    detected BLE messages and this list must be updated as new messages are detected; each list item
    must show the BLE MAC, Device Name and the signal strength (must be dynamically updated)
    UI: DONE!
    TODO: MAX


    • The app must have a floating button that shows or hide a floating menu with the following
    options:
        o Start LE scan
        o Stop LE scan
        o Connect BLE device
        o Disconnect from BLE device
    UI: DONE!
    DONE: MAX


    • When long-click on an item of the detected messages list, the app must try to connect the device
    showing always information about the connection process and its errors or events
    DONE!


    • After successfully connecting a BLE device, the app must discover and list all the services
    published by the BLE device; the list of services must be shown at a fragment or a new screen
    (the floating button must be always visible).
    DONE: MAX


    • When long-click on an item of the services list, the app must shows on a fragment or a new
    screen all the characteristics that belongs to the selected service; the app must shows the
    UUIDs, properties (R/W/N) and descriptors of each service’s characteristic


    • The app must subscribe itself to be notified to all characteristics of the service which has the
    notify property enabled
    TODO: MAX


    • The app must be able to read and write the characteristic of a service and must shows the read
    and write statuses on the screen
    TODO: MAX


    • The app must show notifications when characteristic with notify property enabled changes
    TODO: MAX


    • The app must have a events log that shows all the BLE connection, transactions and errors
    events
    DONE!


     */
}
