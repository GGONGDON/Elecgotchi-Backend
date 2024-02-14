package com.elecgotchi.elecgotchibackend.domain.device.repository;

import com.elecgotchi.elecgotchibackend.domain.device.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
