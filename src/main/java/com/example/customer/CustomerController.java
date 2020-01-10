//package com.example.customer;
//
//import com.example.demo.ResourceNotFoundException;
//import com.example.note.Note;
//import com.example.note.NoteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import javax.validation.Valid;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class CustomerController {
//
//    @Autowired
//    CustomerRepository customerRepository;
//
//    // Get All customers
//    @GetMapping("/customer")
//    public List<Customer> getAllNotes() {
//        return customerRepository.findAll();
//    }
//    // Create a new Note
//    @PostMapping("/customer")
//    public Customer createNote(@Valid @RequestBody Customer customer) {
//        return customerRepository.save(customer);
//    }
//    // Get a Single Note
//    @GetMapping("/customer/{id}")
//    public Customer getCustomerById(@PathVariable(value = "id") Long customerId) {
//        return customerRepository.findById(customerId)
//                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", customerId));
//    }
//    // Update a Note
//    @PutMapping("/customer/{id}")
//    public Note updateNote(@PathVariable(value = "id") Long noteId,
//                           @Valid @RequestBody Note noteDetails) {
//
//        Customer customer = customerRepository.findById(noteId)
//                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
//
//        note.setTitle(noteDetails.getTitle());
//        note.setContent(noteDetails.getContent());
//
//        Note updatedNote = noteRepository.save(note);
//        return updatedNote;
//    }
//    // Delete a Note
//    @DeleteMapping("/customer/{id}")
//    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long customerId) {
//        Note note = noteRepository.findById(customerId)
//                .orElseThrow(() -> new ResourceNotFoundException("customer", "id", customerId));
//
//        noteRepository.delete(note);
//
//        return ResponseEntity.ok().build();
//    }
//}
