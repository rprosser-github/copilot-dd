function validatePhoneNumber(phoneNumber) {
    // Regular expression to validate global phone numbers
    const phoneRegex = /^\+(?:[0-9] ?){6,14}[0-9]$/;

    // Check if the phone number matches the regular expression
    if (phoneRegex.test(phoneNumber)) {
        return true; // Valid phone number
    } else {
        return false; // Invalid phone number
    }
}

