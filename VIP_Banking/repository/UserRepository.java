
package com.VIP.VIP.repository;

import com.VIP.VIP.model.Add;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Add, Long> {
    // Additional custom query methods can be added here if needed
}
