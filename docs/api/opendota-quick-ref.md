

# In your project root
mkdir docs/api
cd docs/api

# Download key API documentation for offline reference
curl https://docs.opendota.com/ > opendota-docs.html

# Create a quick reference file for the agents
cat > opendota-quick-ref.md << 'EOF'
# OpenDota API Quick Reference

**Base URL**: https://api.opendota.com/api
**Documentation**: https://docs.opendota.com/
**Rate Limits**: 60 requests/minute (2000/day without API key)

## Key Endpoints

### Heroes
- GET /heroes - Get hero data
- GET /heroStats - Get hero statistics

### Matches  
- GET /matches/{match_id} - Get match data
- GET /publicMatches - Get public match data
- GET /proMatches - Get professional match data

### Players
- GET /players/{account_id} - Get player data
- GET /players/{account_id}/matches - Get player matches

### Statistics
- GET /distributions - Get distributions of MMR data
- GET /rankings - Get hero rankings

## Sample Responses

### Hero Data Structure
    {
      "id": 1,
      "name": "npc_dota_hero_antimage",
      "localized_name": "Anti-Mage", 
      "primary_attr": "agi",
      "attack_type": "Melee",
      "roles": ["Carry", "Escape", "Nuker"]
    }

### Match Data Structure  
    {
      "match_id": 123456789,
      "duration": 1800,
      "start_time": 1691234567,
      "radiant_win": true,
      "players": [...]
    }
