package com.github.douglasjunior.bluetoothlowenergylibrary;

import java.util.List;
import java.util.UUID;

/**
 * Created by Sandor Farkas on 2020. 10. 10.
 */
interface CharacteristicCommunicator {

    void onCharacteristicWrote(UUID characteristicId, byte[] data);
    void onCharacteristicRead(UUID characteristicId, byte[] data);
    void onGattServiceDiscovered(UUID serviceId);
    void onAvailableCharacteristicsFound(List<UUID> availableCharacteristicIds);
}
